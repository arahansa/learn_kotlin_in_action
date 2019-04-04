package chap02;

public enum Color3 {
    RED(255, 0,0),
    ORANGE(255,165,0);

    int r;
    int g;
    int b;

    Color3(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
}
