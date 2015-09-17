
/// A Doc comment
#[AnAttribute]
pub struct Foo {
    #[rustfmt_skip]
    f :   SomeType, // Comment beside a field
    f: SomeType, // Comment beside a field
    // Comment on a field
    #[AnAttribute]
    g: SomeOtherType,
    /// A doc comment on a field
    h: AThirdType,
    pub i: TypeForPublicField,
}

struct Bar;

struct NewType(Type, OtherType);

struct NewInt<T: Copy>(pub i32, SomeType /* inline comment */, T /* sup */);

struct Qux<'a,
           N: Clone + 'a,
           E: Clone + 'a,
           G: Labeller<'a, N, E> + GraphWalk<'a, N, E>,
           W: Write + Copy>
(
    AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA, // Comment
    BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB,
    #[AnAttr]
    // Comment
    /// Testdoc
    G,
    pub W,
);

struct Tuple(
    // Comment 1
    AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA,
    // Comment 2
    BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB,
);

// With a where clause and generics.
pub struct Foo<'a, Y: Baz>
    where X: Whatever
{
    f: SomeType, // Comment beside a field
}

struct Baz {
    a: A, // Comment A
    b: B, // Comment B
    c: C, // Comment C
}

struct Baz {
    a: A, // Comment A

    b: B, // Comment B

    c: C, // Comment C
}

struct Baz {
    a: A,

    b: B,
    c: C,

    d: D,
}

struct Baz {
    // Comment A
    a: A,

    // Comment B
    b: B,
    // Comment C
    c: C,
}

// Will this be a one-liner?
struct Tuple(A /* Comment */, B);

pub struct State<F: FnMut() -> time::Timespec> {
    now: F,
}

pub struct State<F: FnMut() -> ()> {
    now: F,
}

pub struct State<F: FnMut()> {
    now: F,
}
