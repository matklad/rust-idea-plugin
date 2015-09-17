// rustfmt-fn_args_layout: Block
// rustfmt-where_indent: Inherit
// rustfmt-fn_brace_style: PreferSameLine
// Test different indents.

fn foo(
    a: Aaaaaaaaaaaaaa, b: Bbbbbbbbbbbbbb
) {
    foo();
}

fn bar(
    a: Aaaaaaaaaaaaaa,
    b: Bbbbbbbbbbbbbb,
    c: Cccccccccccccccccc,
    d: Dddddddddddddddd,
    e: Eeeeeeeeeeeeeee
) {
    bar();
}

fn foo(
    a: Aaaaaaaaaaaaaa, b: Bbbbbbbbbbbbbb
) -> String {
    foo();
}

fn bar(
    a: Aaaaaaaaaaaaaa,
    b: Bbbbbbbbbbbbbb,
    c: Cccccccccccccccccc,
    d: Dddddddddddddddd,
    e: Eeeeeeeeeeeeeee
) -> String {
    bar();
}

fn foo(
    a: Aaaaaaaaaaaaaa, b: Bbbbbbbbbbbbbb
) where T: UUUUUUUUUUU {
    foo();
}

fn bar(
    a: Aaaaaaaaaaaaaa,
    b: Bbbbbbbbbbbbbb,
    c: Cccccccccccccccccc,
    d: Dddddddddddddddd,
    e: Eeeeeeeeeeeeeee
) where T: UUUUUUUUUUU {
    bar();
}

fn foo(
    a: Aaaaaaaaaaaaaa, b: Bbbbbbbbbbbbbb
) -> String
where T: UUUUUUUUUUU {
    foo();
}

fn bar(
    a: Aaaaaaaaaaaaaa,
    b: Bbbbbbbbbbbbbb,
    c: Cccccccccccccccccc,
    d: Dddddddddddddddd,
    e: Eeeeeeeeeeeeeee
) -> String
where T: UUUUUUUUUUU {
    bar();
}
