public class Chess {
    private String[] notation;
    private int size;

    public Chess(int n, String[] arr) {
        this.size = n;
        this.notation = new String[this.size];
        for (int i = 0; i < this.size; ++i) {
            this.notation[i] = arr[i];
        }
    }

    public void cout() {
        for (int i = 0; i < this.size; ++i) {
            System.out.println(this.notation[i]);
        }
    }

    public String search(String coord, int iter) {
        char figure = '\0', color = 'w';
        String answ = coord;
        int row = -1;
        for (int i = 0; i < this.size; ++i) {
            color = 'w';
            for (int j = 0; j < this.notation[i].length(); ++j) {
                if (this.notation[i].charAt(j) == ' ') {
                    color = 'b';
                }
                if (coord.charAt(0) == this.notation[i].charAt(j) &&
                    coord.charAt(1) == this.notation[i].charAt(j + 1) &&
                    j < this.notation[i].length() - 2 &&
                    (this.notation[i].charAt(j + 2) == '-' || this.notation[i].charAt(j + 2) == 'x'))
                {
                    figure = this.notation[i].charAt(j - 1);
                    row = i;
                    answ = this.notation[i].substring(j + 3, j + 5);
                    break;
                }
            }
            if (row != -1) {
                --iter;
                break;
            }
        }
        for (int i = row, j = 0; row != -1 && i < this.size && iter > 0; ++i) {
            for (; j < this.notation[i].length() && iter > 0; ++j) {
                if (figure == this.notation[i].charAt(j) &&
                    j + 5 < this.notation[i].length() &&
                    answ.charAt(0) == this.notation[i].charAt(j + 1) &&
                    answ.charAt(1) == this.notation[i].charAt(j + 2))
                {
                    answ = this.notation[i].substring(j + 4, j + 6);
                    --iter;
                    j += 5;
                }
                if (this.notation[i].charAt(j) == 'x' &&
                        this.notation[i].charAt(j + 1) == answ.charAt(0) &&
                        this.notation[i].charAt(j + 2) == answ.charAt(1))
                {
                    return "Your figure was eaten";
                }
                if (this.notation[i].charAt(j) == '#') {
                    row = -1;
                    break;
                }
            }
            j = 0;
        }
        return answ;
    }
}
