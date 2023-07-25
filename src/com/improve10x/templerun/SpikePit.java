package com.improve10x.templerun;

public class SpikePit {

    private int width;
    public SpikePit(int width) {
        this.width = width;
            if(width < 0 || width > 20) {
                throw new InvalidSpikePitException();
            }
        }
        public void trap() {
            System.out.println("SpikePit is trapped with " + width + " meters width!");
        }

        public class InvalidSpikePitException extends RuntimeException{
        }
}
