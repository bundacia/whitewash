# Whitewash

A Clojure library designed to encode text as whitespace. Inspired by [ACME::Bleach](http://search.cpan.org/perldoc?Acme%3A%3ABleach).

## Usage

    user=> (wash "text")
    "\t   \t \t\t\t  \t\t \t \t    \t\t\t\t   \t \t\t"
    user=> (unwash (wash "text"))
    "text"

## License

Whitewash is released under the [MIT License](http://www.opensource.org/licenses/MIT).
