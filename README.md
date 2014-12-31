# Whitewash

A Clojure library designed to encode text as whitespace. Inspired by [ACME::Bleach](http://search.cpan.org/perldoc?Acme%3A%3ABleach).

## Usage

    user=> (wash "text")
    "\t   \t \t\t\t  \t\t \t \t    \t\t\t\t   \t \t\t"
    user=> (unwash (wash "text"))
    "text"

## Command Line Tool

Examples:

    % WASHED=`lein run wash "text"`
    % echo -n "$WASHED" | lein run unwash
    text

Both commands will accept input as the second argument or from STDIN.

## License

Whitewash is released under the [MIT License](http://www.opensource.org/licenses/MIT).
