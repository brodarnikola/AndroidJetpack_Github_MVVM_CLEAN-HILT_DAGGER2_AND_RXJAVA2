/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.vjezba.data.networking

import com.vjezba.data.networking.model.RepositoryResponseApi
import com.vjezba.domain.model.RepositoryResponse
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*
import io.reactivex.Observable
import io.reactivex.Single

/**
 * Used to connect to the Unsplash API to fetch photos
 */
interface GithubRepositoryApi {

    @GET("search/repositories")
    suspend fun searchGithubRepository(
        @Query("q") query: String,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): RepositoryResponseApi

    @GET("search/repositories?sort=stars&order=desc")
    suspend fun searchGithubRepositoryByProgrammingLanguage(
        @Query("q") query: String,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): RepositoryResponseApi


    // example for rxjava
    @GET("search/repositories")
    fun searchGithubRepositoryWithRxJava2(
        @Query("q") query: String,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): Single<RepositoryResponseApi>

    @GET("search/repositories")
    fun searchGithubRepositoryWithFlowable(
        @Query("q") query: String,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): Flowable<RepositoryResponseApi>

}
