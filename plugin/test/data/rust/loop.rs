
fn main() {
    loop {
        return some_val;
    }

    let x = loop {
        do_forever();
    };

    'label: loop {
        // Just comments
    }

    'a: while loooooooooooooooooooooooooooooooooong_variable_name + another_value >
              some_other_value {}

    while aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa > bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb {
    }

    'b: for xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx in some_iter(arg1,
                                                                                        arg2) {
        // do smth
    }

    while let Some(i) = x.find('s') {
        x.update();
        // FIXME #184
        // continue;
        // continue 'foo;
    }
}
