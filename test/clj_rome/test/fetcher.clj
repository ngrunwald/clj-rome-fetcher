(ns clj-rome.test.fetcher
  (:use [clj-rome.reader] :reload)
  (:use [clj-rome.fetcher] :reload)
  (:use [clojure.test]))

(let [feed-url "http://www.atomenabled.org/atom.xml"
      fetcher (build-url-fetcher :hash-map)]
  (deftest functional-test
    (is (instance? com.sun.syndication.fetcher.FeedFetcher fetcher))
    (is (not (empty?
              (with-fetcher fetcher
                (:entries (retrieve-feed feed-url))))))))

