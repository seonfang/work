package cn.com.taiji;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class chooseWords {

	/**
	 * 查找文件中长度为n的所有单词
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		final String inputFileName = "wordsFile.txt";
		final String outputFileName = "chooseWordsFile.txt";
		final int chooseWordLength = 5;
		
	
		List<String> words = Files.lines(Paths.get(inputFileName))
				.flatMap(Pattern.compile("")::splitAsStream)
				.filter(s -> s.length() ==chooseWordLength)
				.map(String::toUpperCase)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		Files.write(Paths.get(outputFileName), words, StandardCharsets.UTF_8);
	}
}
