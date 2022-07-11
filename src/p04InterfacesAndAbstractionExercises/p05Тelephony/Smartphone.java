package p04InterfacesAndAbstractionExercises.p05Тelephony;

import java.util.List;
import java.util.stream.Collectors;

public class Smartphone implements Browsable, Callable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        return this.urls
                .stream()
                .map(url -> url.matches(".*\\d+.*") ? "Invalid URL!" : String.format("Browsing: %s!", url))
                .collect(Collectors.joining(System.lineSeparator()));
    }

    @Override
    public String call() {
        return this.numbers
                .stream()
                .map(number -> number.matches("\\d*\\D+\\d*") ? "Invalid number!" : String.format("Calling... %s", number))
                .collect(Collectors.joining(System.lineSeparator()));
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }
}
