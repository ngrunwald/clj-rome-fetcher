# clj-rome

 A simple Clojure wrapper for the [ROME](http://rometools.org/) fetcher, to be used with [clj-rome](https://github.com/ngrunwald/clj-rome).

## Installation

`clj-rome` is available as a Maven artifact from
[Clojars](http://clojars.org/clj-rome-fetcher):
```clojure
[clj-rome-fetcher "0.1.0"]
```

## Usage

 You can use the ROME fetcher to retrieve a feed from the web with caching and conditional GET handled for you:
```clojure
    ;; creating a caching fetcher
    ;; type can be any of :hash-map, :linked-hash-map, :disk
    (use 'clj-rome.fetcher)
    (def fetcher (build-url-fetcher :disk "/tmp/cache"))

    ;; you can attach a listener to your fetcher
    (add-listener fetcher (fn [event] (println event)))

    ;; using the fetcher with a cache to fetch a feed
    (def feed
      (with-fetcher fetcher
        (retrieve-feed "http://www.atomenabled.org/atom.xml")))
```

 For more documentation on ROME, see the [ROME Fetcher javadocs](http://www.jarvana.com/jarvana/view/net/java/dev/rome/rome-fetcher/1.0.0/rome-fetcher-1.0.0-javadoc.jar!/overview-summary.html).

## License

Copyright (C) 2012, 2013 Nils Grunwald

Distributed under the Eclipse Public License, the same as Clojure.
