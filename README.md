# Leipzig Template 

A Leiningen template for [Leipzig](https://github.com/ctford/leipzig) tracks.

## Usage

This template creates a new Leipzig project, with a ready-made snippet of music to get you started.
* `lein new leipzig my-symphony`
* `cd my-symphony`
* `lein run`

This should play the starting snippet and show you how things fit together.

For best results, I recommend loading the `song` namespace in a repl. The `live/jam` function is particularly
useful for interactive composition, as it loops a melody forever, but re-dereferences the var passed to it
each time round the loop. This means that changes you make are reflected in the continuously playing track
next time around.

## Licence

Copyright © 2014 Chris Ford 

Distributed under the MIT Licence.
