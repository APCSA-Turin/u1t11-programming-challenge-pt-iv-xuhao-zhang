package com.example.project;

public class StringProblems {
    // empty constructor
    public StringProblems() {
    }

    // Given a string, return true if it ends in "ly".
    // endsLy("oddly") → true
    // endsLy("y") → false
    // endsLy("oddy") → false
    public boolean endsLy(String x) {
        try {
            if (x.substring(x.length() - 2).equals("ly")) {
                return true;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return false;
        }
        return false;
    }

    // Given two strings, append them together (known as "concatenation")
    // and return the result. However, if the concatenation creates a double-char,
    // then omit one of the chars, so "abc" and "cat" yields "abcat".
    // conCat("abc", "cat") → "abcat"
    // conCat("dog", "cat") → "dogcat"
    // conCat("abc", "") → "abc"
    public String conCat(String s1, String s2) {
        try {
            if (s1.charAt(s1.length() - 1) == (s2.charAt(0))) {
            return s1 + s2.substring(1);
        }
        return s1 + s2;
    } catch (StringIndexOutOfBoundsException e) {
        return s1 + s2;
    }
}

    // Given a string, return a version without the first 2 chars.
    // Except keep the first char if it is 'a' and keep the second char if it is
    // 'b'.
    // The string may be any length. Harder than it looks.
    // deFront("Hello") → "llo"
    // deFront("java") → "va"
    // deFront("away") → "aay"
    // deFront("aapple") ->"apple"
    // deFront("abee") - > "abee"
    // deFront("ab") -> "ab"
    // deFront("a") -> "a"
    // deFront("ba") -> ""
    public String deFront(String s1) {
        try {
            if ((s1.charAt(0) == "a".charAt(0)) && (s1.charAt(1) == "b".charAt(0))) {
                return s1;
            } else if (s1.charAt(0) == "a".charAt(0)) {
                return "a" + s1.substring(2);
            } else if (s1.charAt(1) == "b".charAt(0)) {
                return s1.substring(1);
            } else {
                return s1.substring(2);
            }
        } catch (StringIndexOutOfBoundsException e) {
            if (s1.length() == 0) {
                return "";
            }
            if (s1.charAt(0) == "a".charAt(0)) {
                return s1;
            }
            return "";
        }
    }

    // Given a string, if the first or last chars are 'x',
    // return the string without those 'x' chars, and otherwise
    // return the string unchanged.
    // withoutX("xHix") → "Hi"
    // withoutX("xHi") → "Hi"
    // withoutX("Hxix") → "Hxi"
    // withoutX("") → ""
    public String withoutX(String s1) {
        if (s1.charAt(0) == "x".charAt(0)) {
            if (s1.charAt(s1.length() - 1) == "x".charAt(0)) {
                try {
                    return (s1.substring(1, s1.length() - 1));
                } catch (StringIndexOutOfBoundsException e) {
                    return ("");
                }
            } else {
                return s1.substring(1);
            }
        }
        if (s1.charAt(s1.length() - 1) == "x".charAt(0)) {
            return s1.substring(0, s1.length() - 1);
        }
        return s1;
    }

    // Given a string str, if the string starts with "f" return "Fizz".
    // If the string ends with "b" return "Buzz". If both the "f" and "b"
    // conditions are true, return "FizzBuzz". In all other cases, return the
    // string unchanged. (See also: FizzBuzz Code)
    // fizzString("fig") → "Fizz"
    // fizzString("dib") → "Buzz"
    // fizzString("fib") → "FizzBuzz"
    public String fizzString(String s1) {
        try {
            if (s1.charAt(0) == "f".charAt(0) && s1.charAt(s1.length() - 1) == "b".charAt(0)) {
                return "FizzBuzz";
            }
            if (s1.charAt(0) == "f".charAt(0)) {
                return "Fizz";
            }
            if (s1.charAt(s1.length() - 1) == "b".charAt(0)) {
                return "Buzz";
            }
            return s1;
        } catch (StringIndexOutOfBoundsException e) {
            if (s1.equals("f")) {
                return "Fizz";
            }
            if (s1.equals("b")) {
                return "Buzz";
            }
            return s1;
        }
    }
}