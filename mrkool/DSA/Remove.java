package mrkool;

public class Remove {
    public static void main(String[] args) {
        String str = "68 735 101 770 525 279 559 563 465 106 146 82 28 362 492 596 743 28 637 392 205 703 154 293 383 622 317 519 696 648 127 372 339 270 713 68 700 236 295 704 612 123";
        System.out.println(str.replaceAll("\\s", ","));
    }
}
