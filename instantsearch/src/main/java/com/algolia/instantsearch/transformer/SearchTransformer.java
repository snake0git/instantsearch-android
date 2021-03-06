/*
 *
 *  * Copyright (c) 2018 Algolia
 *  * http://www.algolia.com/
 *  *
 *  * Permission is hereby granted, free of charge, to any person obtaining a copy
 *  * of this software and associated documentation files (the "Software"), to deal
 *  * in the Software without restriction, including without limitation the rights
 *  * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  * copies of the Software, and to permit persons to whom the Software is
 *  * furnished to do so, subject to the following conditions:
 *  *
 *  * The above copyright notice and this permission notice shall be included in
 *  * all copies or substantial portions of the Software.
 *  *
 *  * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  * THE SOFTWARE.
 *
 */

package com.algolia.instantsearch.transformer;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.algolia.search.saas.CompletionHandler;
import com.algolia.search.saas.Query;
import com.algolia.search.saas.Request;
import com.algolia.search.saas.RequestOptions;
import com.algolia.search.saas.Searchable;

import org.json.JSONObject;

import java.util.Collection;
import java.util.Map;

/***
 * Base class used to implement a custom backend with Algolia
 * You need to make sure to implement the following method:
 * {@link SearchTransformer#search(Object, SearchResultsHandler)}
 * {@link SearchTransformer#map(Query)}
 * {@link SearchTransformer#map(Object)}
 */
public abstract class SearchTransformer<Parameters, Results> extends Searchable implements Transformable<Parameters, Results> {

    @Override
    public void search(@Nullable Parameters query, @Nullable SearchResultsHandler<Results> completionHandler) {

    }

    @Override
    public Parameters map(@NonNull Query query) {
        throw new UnsupportedOperationException("This method was not implemented yet; override it if you need it");
    }

    @Override
    public Parameters map(@NonNull Query query, @NonNull Collection<String> disjunctiveFacets, @NonNull Map<String, ? extends Collection<String>> refinements) {
        throw new UnsupportedOperationException("This method was not implemented yet; override it if you need it");
    }

    @Override
    public JSONObject map(@NonNull Results results) {
        throw new UnsupportedOperationException("This method was not implemented yet; override it if you need it");
    }

    @Override
    public void searchForFacetValues(@NonNull Parameters query, @Nullable SearchResultsHandler<Results> completionHandler) {
        search(query, completionHandler);
    }

    @Override
    public Parameters map(@Nullable Query query, @NonNull String facetName, @NonNull String matchingText) {
        return null;
    }

    @Override
    public Request searchAsync(@Nullable Query query, @Nullable RequestOptions requestOptions, @Nullable CompletionHandler completionHandler) {
        throw new UnsupportedOperationException("This method was not implemented yet; override it if you need it");
    }
}
