package com.practise1;

public class Sentencereverse {
	public static void main(String[] args) {
		String originalSentence = "india iz my country";
		System.out.println(reverseSentence(originalSentence));
	}

	private static StringBuilder reverseSentence(String originalSentence) {
		String[] sentenceArrray = originalSentence.split(" ");
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = sentenceArrray.length - 1; i >= 0; i--) {
			stringBuilder.append(sentenceArrray[i] + " ");
		}
		return stringBuilder;
	}
}
