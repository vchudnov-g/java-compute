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
package com.google.cloud.compute.v1.stub;

import static com.google.cloud.compute.v1.SslPolicyClient.ListSslPoliciesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.DeleteSslPolicyHttpRequest;
import com.google.cloud.compute.v1.GetSslPolicyHttpRequest;
import com.google.cloud.compute.v1.InsertSslPolicyHttpRequest;
import com.google.cloud.compute.v1.ListAvailableFeaturesSslPoliciesHttpRequest;
import com.google.cloud.compute.v1.ListSslPoliciesHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchSslPolicyHttpRequest;
import com.google.cloud.compute.v1.SslPoliciesList;
import com.google.cloud.compute.v1.SslPoliciesListAvailableFeaturesResponse;
import com.google.cloud.compute.v1.SslPolicy;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link SslPolicyStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (https://compute.googleapis.com/compute/v1/projects/) and
 *       default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of deleteSslPolicy to 30 seconds:
 *
 * <pre>
 * <code>
 * SslPolicyStubSettings.Builder sslPolicySettingsBuilder =
 *     SslPolicyStubSettings.newBuilder();
 * sslPolicySettingsBuilder.deleteSslPolicySettings().getRetrySettings().toBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * SslPolicyStubSettings sslPolicySettings = sslPolicySettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class SslPolicyStubSettings extends StubSettings<SslPolicyStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/compute")
          .add("https://www.googleapis.com/auth/compute.readonly")
          .add("https://www.googleapis.com/auth/devstorage.full_control")
          .add("https://www.googleapis.com/auth/devstorage.read_only")
          .add("https://www.googleapis.com/auth/devstorage.read_write")
          .build();

  private final UnaryCallSettings<DeleteSslPolicyHttpRequest, Operation> deleteSslPolicySettings;
  private final UnaryCallSettings<GetSslPolicyHttpRequest, SslPolicy> getSslPolicySettings;
  private final UnaryCallSettings<InsertSslPolicyHttpRequest, Operation> insertSslPolicySettings;
  private final PagedCallSettings<
          ListSslPoliciesHttpRequest, SslPoliciesList, ListSslPoliciesPagedResponse>
      listSslPoliciesSettings;
  private final UnaryCallSettings<
          ListAvailableFeaturesSslPoliciesHttpRequest, SslPoliciesListAvailableFeaturesResponse>
      listAvailableFeaturesSslPoliciesSettings;
  private final UnaryCallSettings<PatchSslPolicyHttpRequest, Operation> patchSslPolicySettings;

  /** Returns the object with the settings used for calls to deleteSslPolicy. */
  public UnaryCallSettings<DeleteSslPolicyHttpRequest, Operation> deleteSslPolicySettings() {
    return deleteSslPolicySettings;
  }

  /** Returns the object with the settings used for calls to getSslPolicy. */
  public UnaryCallSettings<GetSslPolicyHttpRequest, SslPolicy> getSslPolicySettings() {
    return getSslPolicySettings;
  }

  /** Returns the object with the settings used for calls to insertSslPolicy. */
  public UnaryCallSettings<InsertSslPolicyHttpRequest, Operation> insertSslPolicySettings() {
    return insertSslPolicySettings;
  }

  /** Returns the object with the settings used for calls to listSslPolicies. */
  public PagedCallSettings<
          ListSslPoliciesHttpRequest, SslPoliciesList, ListSslPoliciesPagedResponse>
      listSslPoliciesSettings() {
    return listSslPoliciesSettings;
  }

  /** Returns the object with the settings used for calls to listAvailableFeaturesSslPolicies. */
  public UnaryCallSettings<
          ListAvailableFeaturesSslPoliciesHttpRequest, SslPoliciesListAvailableFeaturesResponse>
      listAvailableFeaturesSslPoliciesSettings() {
    return listAvailableFeaturesSslPoliciesSettings;
  }

  /** Returns the object with the settings used for calls to patchSslPolicy. */
  public UnaryCallSettings<PatchSslPolicyHttpRequest, Operation> patchSslPolicySettings() {
    return patchSslPolicySettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public SslPolicyStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonSslPolicyStub.create(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportChannelProvider().getTransportName());
    }
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "https://compute.googleapis.com/compute/v1/projects/";
  }

  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return 443;
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstantiatingHttpJsonChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultHttpJsonTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken("gapic", GaxProperties.getLibraryVersion(SslPolicyStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected SslPolicyStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    deleteSslPolicySettings = settingsBuilder.deleteSslPolicySettings().build();
    getSslPolicySettings = settingsBuilder.getSslPolicySettings().build();
    insertSslPolicySettings = settingsBuilder.insertSslPolicySettings().build();
    listSslPoliciesSettings = settingsBuilder.listSslPoliciesSettings().build();
    listAvailableFeaturesSslPoliciesSettings =
        settingsBuilder.listAvailableFeaturesSslPoliciesSettings().build();
    patchSslPolicySettings = settingsBuilder.patchSslPolicySettings().build();
  }

  private static final PagedListDescriptor<ListSslPoliciesHttpRequest, SslPoliciesList, SslPolicy>
      LIST_SSL_POLICIES_PAGE_STR_DESC =
          new PagedListDescriptor<ListSslPoliciesHttpRequest, SslPoliciesList, SslPolicy>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListSslPoliciesHttpRequest injectToken(
                ListSslPoliciesHttpRequest payload, String token) {
              return ListSslPoliciesHttpRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListSslPoliciesHttpRequest injectPageSize(
                ListSslPoliciesHttpRequest payload, int pageSize) {
              return ListSslPoliciesHttpRequest.newBuilder(payload).setMaxResults(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListSslPoliciesHttpRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(SslPoliciesList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<SslPolicy> extractResources(SslPoliciesList payload) {
              return payload.getItemsList() != null
                  ? payload.getItemsList()
                  : ImmutableList.<SslPolicy>of();
            }
          };

  private static final PagedListResponseFactory<
          ListSslPoliciesHttpRequest, SslPoliciesList, ListSslPoliciesPagedResponse>
      LIST_SSL_POLICIES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListSslPoliciesHttpRequest, SslPoliciesList, ListSslPoliciesPagedResponse>() {
            @Override
            public ApiFuture<ListSslPoliciesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListSslPoliciesHttpRequest, SslPoliciesList> callable,
                ListSslPoliciesHttpRequest request,
                ApiCallContext context,
                ApiFuture<SslPoliciesList> futureResponse) {
              PageContext<ListSslPoliciesHttpRequest, SslPoliciesList, SslPolicy> pageContext =
                  PageContext.create(callable, LIST_SSL_POLICIES_PAGE_STR_DESC, request, context);
              return ListSslPoliciesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Builder for SslPolicyStubSettings. */
  public static class Builder extends StubSettings.Builder<SslPolicyStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final UnaryCallSettings.Builder<DeleteSslPolicyHttpRequest, Operation>
        deleteSslPolicySettings;
    private final UnaryCallSettings.Builder<GetSslPolicyHttpRequest, SslPolicy>
        getSslPolicySettings;
    private final UnaryCallSettings.Builder<InsertSslPolicyHttpRequest, Operation>
        insertSslPolicySettings;
    private final PagedCallSettings.Builder<
            ListSslPoliciesHttpRequest, SslPoliciesList, ListSslPoliciesPagedResponse>
        listSslPoliciesSettings;
    private final UnaryCallSettings.Builder<
            ListAvailableFeaturesSslPoliciesHttpRequest, SslPoliciesListAvailableFeaturesResponse>
        listAvailableFeaturesSslPoliciesSettings;
    private final UnaryCallSettings.Builder<PatchSslPolicyHttpRequest, Operation>
        patchSslPolicySettings;

    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "idempotent",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put("non_idempotent", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(20000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(20000L))
              .setTotalTimeout(Duration.ofMillis(600000L))
              .build();
      definitions.put("default", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      deleteSslPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      getSslPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertSslPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      listSslPoliciesSettings = PagedCallSettings.newBuilder(LIST_SSL_POLICIES_PAGE_STR_FACT);

      listAvailableFeaturesSslPoliciesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      patchSslPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              deleteSslPolicySettings,
              getSslPolicySettings,
              insertSslPolicySettings,
              listSslPoliciesSettings,
              listAvailableFeaturesSslPoliciesSettings,
              patchSslPolicySettings);

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder
          .deleteSslPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .getSslPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .insertSslPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listSslPoliciesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listAvailableFeaturesSslPoliciesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .patchSslPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    protected Builder(SslPolicyStubSettings settings) {
      super(settings);

      deleteSslPolicySettings = settings.deleteSslPolicySettings.toBuilder();
      getSslPolicySettings = settings.getSslPolicySettings.toBuilder();
      insertSslPolicySettings = settings.insertSslPolicySettings.toBuilder();
      listSslPoliciesSettings = settings.listSslPoliciesSettings.toBuilder();
      listAvailableFeaturesSslPoliciesSettings =
          settings.listAvailableFeaturesSslPoliciesSettings.toBuilder();
      patchSslPolicySettings = settings.patchSslPolicySettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              deleteSslPolicySettings,
              getSslPolicySettings,
              insertSslPolicySettings,
              listSslPoliciesSettings,
              listAvailableFeaturesSslPoliciesSettings,
              patchSslPolicySettings);
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to deleteSslPolicy. */
    public UnaryCallSettings.Builder<DeleteSslPolicyHttpRequest, Operation>
        deleteSslPolicySettings() {
      return deleteSslPolicySettings;
    }

    /** Returns the builder for the settings used for calls to getSslPolicy. */
    public UnaryCallSettings.Builder<GetSslPolicyHttpRequest, SslPolicy> getSslPolicySettings() {
      return getSslPolicySettings;
    }

    /** Returns the builder for the settings used for calls to insertSslPolicy. */
    public UnaryCallSettings.Builder<InsertSslPolicyHttpRequest, Operation>
        insertSslPolicySettings() {
      return insertSslPolicySettings;
    }

    /** Returns the builder for the settings used for calls to listSslPolicies. */
    public PagedCallSettings.Builder<
            ListSslPoliciesHttpRequest, SslPoliciesList, ListSslPoliciesPagedResponse>
        listSslPoliciesSettings() {
      return listSslPoliciesSettings;
    }

    /** Returns the builder for the settings used for calls to listAvailableFeaturesSslPolicies. */
    public UnaryCallSettings.Builder<
            ListAvailableFeaturesSslPoliciesHttpRequest, SslPoliciesListAvailableFeaturesResponse>
        listAvailableFeaturesSslPoliciesSettings() {
      return listAvailableFeaturesSslPoliciesSettings;
    }

    /** Returns the builder for the settings used for calls to patchSslPolicy. */
    public UnaryCallSettings.Builder<PatchSslPolicyHttpRequest, Operation>
        patchSslPolicySettings() {
      return patchSslPolicySettings;
    }

    @Override
    public SslPolicyStubSettings build() throws IOException {
      return new SslPolicyStubSettings(this);
    }
  }
}
