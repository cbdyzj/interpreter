package org.jianzhao.interpreter;

import org.graalvm.polyglot.Context;

public class App {

    public static void main(String[] args) {
        var context = Context.create("js");
        context.eval("js", "console.log('hello world')");
    }
}
