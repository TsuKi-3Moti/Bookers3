// Java　区切り文字
// Scannerのnextメソッド類は区切り文字(デフォルトは空白区切り文字、大小スペースや改行)の前までを受け取るため、

// 空白も読み取りたい場合は.nextLine()で空白を含めた行全体を読み込む！


// 三行のデータを行ごとに出力したい場合、
        String firstLine = sc.nextLine();
        String secondLine = sc.nextLine();
        String thirdLine = sc.nextLine();

        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println(thirdLine);


// 以下のようなfor文で入出力を三回繰り返すようにする
        for (int i = 0; i < 3; i++) {
            String S = sc.nextLine();
            System.out.println(S);
        }

// Ｎ回繰り返すときに使いやすい
// hasNext関数
// 前から順に値を習得し、まだ習得できる値がある場合にはtrue、そうでない場合にはfalseを返す。

// nextメソッドの種類に対応している
// hasNext関数　String型でdefaultであれば空白区切り文字単位
// hasNextLine関数　行単位
// hasNextInt関数
// など

// ★for文で回数が指定できないときに、trueの間繰り返すwhile文と組み合わせて使う

// 与えられた行数N回分繰り返す
// 条件　N <= 10であること
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (sc.hasNextLine()) {
            if (count > 10) {
                break;
            }
            String line = sc.nextLine();
            System.out.println(line);
            count++;
        }
    }
}

// 入力で受け取ったString型の数字をint型に変換する
// int N = Integer.parseInt(sc.nextLine());
// https://www.tairaengineer-note.com/java-integer-parseint/
// parseUnsignedInt、 Boolean.parseBoolean、Double.parseDoubleについて
// https://www.fenet.jp/java/column/java_tips/6643/


// N行のデータの入力
// 1行目でNが与えられる。
// N行にわたってそれぞれ文字列が与えられる。
// N行で出力
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
	// int N = sc.nextInt(); だと改行文字が残って、それが繰り返し処理のnextLine()に含まれてしまう
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
}

// 3つのデータ入力
// 3つの文字列が半角スペース区切りで1行で与えられる。
// 3行で出力
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String str = sc.next();
            System.out.println(str);
        }
    }
}

// Ｎ個のデータの入力
// 1行目でデータの個数Nが与えられる。2行目でN個の文字列が半角スペース区切りで与えられる。
// N行で出力
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            System.out.println(str);
        }

    }
}

// カンマ区切りの3つのデータの入力
// 3つの文字列がカンマ区切りで一行で与えられる
// 3行で出力

import java.util.*;
public clasIs Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] strings = line.split(",");

        for(String string: strings) {
            System.out.print(string);
        }
    }
}

// useDelimiter　ユーズデリミタ　Scannerクラスのメソッド
// デフォルトが空白文字区切りであるのを文字列や正規表現パターンを使って別の値に変更する

// 区切り文字を指定してからfor文の中で回す
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(",");

        for(int i = 0; i < 3; i++) {
            String str = sc.next();
            System.out.println(str);
        }
    }
}


// カンマ区切りのN個のデータの入力
// 1行目で行数Nが与えられる
// 2行目でN個の文字列がカンマ区切りで与えられる
// 各文字列をN行で出力
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// 引数でnextLine関数で空白文字を残さず、Int型に変換している
        int N = Integer.parseInt(sc.nextLine());
        sc.useDelimiter(",");

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            System.out.println(str);
        }
    }
}



int N = sc.nextInt();　// 空白文字(改行)が残る
sc.useDelimiter(",");
for (int i = 0; i < N; i++) {
     String s = sc.next();
    System.out.println(s.strip());
 }

// 全角スペースを含みたいならstrip
// ・stripメソッド　ストリップ　前後の全角半角スペース、改行、タブを削除
// ・trimメソッド　トリム　前後の半角スペース、改行、タブを削除




// 累乗
// ((A + B) x C)の2の累乗
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int A = 202;
        int B = 134;
        int C = 107;
        int result = (A + B) * C;
        System.out.println(result * result);
    }
}


// 代入演算1
import java.util.*;
public class Main {
    public static void main(String[] args) {
        var N = 0;
// javaでは3桁毎にカンマの代わりにアンダーバーで区切って可読性を上げる
        N += 3_286;
        N *= 4_736;
        N %= 12_312;
        System.out.println(N);
    }
}




//一行目で文字列Sが与えられる
//Sがpaizaと一致する場合はYESを出力
// 一致しない場合はNOを出力
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        switch (line) {
            case "paiza":
                System.out.println("YES");
                break;
            default:
                System.out.println("NO");
                break;
        }
    }
}




// 一行目で整数Nが与えられる
// Nが100以下であればYESを出力
// そうでなければNOを出力
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N <= 100) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}



// ある占いでは、箱の中に 1~9 までのいずれかの数字が書かれている玉を取り出し、その玉に書かれている数字から運勢を占います。玉に書かれている数字が 7 の時は大吉となります。占いで取り出した玉に書かれている数字が 1 つ与えられます。大吉かどうかを判定してください。

// 一行目で取り出した玉に書かれた整数N（1~9）が与えられる
// Nが大吉である７の時はYESを出力
// それ以外の場合はNOを出力
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        switch (N) {
            case 7:
                System.out.println("Yes");
                break;
            default:
                System.out.println("No");
                break;
        }
    }
}




// 一行で正の整数Nが与えられる
// 1~Nの整数を1から順に改行区切りで出力
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }
}




// 1 ~ 100 の整数に対して
// 3 と 5 の両方で割り切れるなら FizzBuzz
// 3 でのみ割り切れるなら Fizz
// 5 でのみ割り切れるなら Buzz を改行区切りで出力
// どちらでも割り切れない場合は、その数字を改行区切りで出力

import java.util.*;
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}




// 1から1000までの数字を半角スペース区切りで出力(1000の後には空白はつけない)
import java.util.*;
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (i < 1000) {
                System.out.print(i + " ");
            } else {
                System.out.print(i);
            }
        }
    }
}



 // 配列を使う場合
// String.join()　第一引数でdelimiter、第二引数でelements(配列など)を指定するとdelimiterで結合されたelementsのStringが返る
// String.joiner() 引数一つでjoinのように使うことも可能
// 更に第二引数にprefix、第三引数でsuffixを指定することもできる


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        
        for (int i = 0; i < num.length(); i++) {
            if (i != 0 && i % 3 == 0) {
                System.out.print(",");
            }
            
            System.out.print(num.charAt(i));
        }
    }
}



// 大きな数値(intで扱える最大値を超えた数値を含む)を三桁ごとにカンマ区切りで出力
// 大きな数値(intで扱える最大値を超えた数値を含む)Nが与えられる
// このときのNの桁数は必ず３の倍数とする
// Nを三桁ごとにカンマ区切りで出力
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        
        for (int i = 0; i < num.length(); i++) {
	   // 0 % 3も0となって該当してしまうため、条件にiが0じゃないときを加える
            if (i != 0 && i % 3 == 0) {
                System.out.print(",");
            }
            System.out.print(num.charAt(i));
        }
    }
}

// ★index値が3の倍数であるときに、その値の前にカンマを付ける考え方であれば、index値に対する値が3の倍数の後にカンマを付ける考え方の時と違い、余分なカンマを防止できる



// 大きな数値Nが入力されます。 位の小さい方から 3 けたごとにカンマ区切りで出力してください。
// ただし、Nのけた数は 3 の倍数とは限りません。



// 9 個の数値が半角スペース区切りで入力されます。この数値を 3 行 3 列の形式で出力してください。
// 具体的には、入力された数値を N_1 , N_2 , N_3 , ..., N_9 とするとき、 1 行目にはN_1 からN_3 を、2 行目には N_4 から N_6 を、3 行目には N_7 から N_9 を出力してください。
// ただし、数値の間には半角スペースを、各行の末尾には、半角スペースの代わりに改行を入れてください。

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            String N = sc.next();
            System.out.print(N);

            if (i % 3 == 2) {
                System.out.println();
            } else {
                System.out.print(" ");
            }

        } 
    }
}



// 九九表を出力してください。具体的には、出力のi行j列目 (1 ≦ i, j ≦ 9) の数値は i * j になるように出力してください。
// ただし、数値の間には半角スペースを、各行の末尾には、半角スペースの代わりに改行を入れてください。

// 二次元配列を使うことによって、表の各データを格納しておける
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[][] nums = new int[9][9];
        // 九九表を二次元配列で作る
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                nums[row][column] = (row + 1) * (column + 1);
            } 
        }
        // 計算結果を出力する
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                System.out.print(nums[row][column]);
                if (column == 8) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            } 
        }
        
    }
}

// データは格納せずに、その場で計算して出力
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        for (int row = 1; row <= 9; row++) {
            for (int column = 1; column <= 9; column++) {
                System.out.print(row * column);
                if (column < 9) {
                    System.out.print(" ");
                } else {
                    System.out.println();
                }
            } 
        }
    }
}
