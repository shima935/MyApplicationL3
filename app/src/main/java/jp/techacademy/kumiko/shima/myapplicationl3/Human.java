package jp.techacademy.kumiko.shima.myapplicationl3;

import android.util.Log;

/**
 * Created by shima on 2017/10/20.
 */

public class Human extends Animal implements Thinkable {
    static String TAG = Human;
    private String hobby;

    public Human(String name, int age, String hobby) {
        Log.d(TAG, "コンストラクタ");
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    @Override
    public void say () {
        Log.d(TAG, "私の名前は" + this.name + "です。年は" + this.age + "歳です。");
    }

    @Override
    public void say () {
        Log.d(TAG, "私は" + this.hobby + "について考える。");
    }
}
