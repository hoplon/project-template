# Hoplon project template

Use it to generate a Hoplon project.

## Usage

This is a template project for use with [deps-new](https://github.com/seancorfield/deps-new).
It will produce a new library project when run:

```bash
clojure -Sdeps '{:deps {io.github.hoplon/project-template {:git/tag "v0.3.0" :git/sha "ed6ce5f"}}}' -Tnew create :template hoplon/hoplon :name your/app-name
```

Assuming you have installed `deps-new` as your `new` "tool" via:

```bash
clojure -Ttools install io.github.seancorfield/deps-new '{:git/tag "v0.5.2"}' :as new
```

Run this template project's tests (by default, this just validates your template's `template.edn`
file -- that it is valid EDN and it satisfies the `deps-new` Spec for template files):

    $ clojure -T:build test

## License

Copyright © 2023 Marcelo Nomoto

Distributed under the Eclipse Public License version 1.0.
