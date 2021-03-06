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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/custom_job.proto

package com.google.cloud.aiplatform.v1beta1;

public interface CustomJobSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.CustomJobSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The spec of the worker pools including machine type and Docker image.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.WorkerPoolSpec worker_pool_specs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.WorkerPoolSpec> getWorkerPoolSpecsList();
  /**
   *
   *
   * <pre>
   * Required. The spec of the worker pools including machine type and Docker image.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.WorkerPoolSpec worker_pool_specs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.WorkerPoolSpec getWorkerPoolSpecs(int index);
  /**
   *
   *
   * <pre>
   * Required. The spec of the worker pools including machine type and Docker image.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.WorkerPoolSpec worker_pool_specs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getWorkerPoolSpecsCount();
  /**
   *
   *
   * <pre>
   * Required. The spec of the worker pools including machine type and Docker image.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.WorkerPoolSpec worker_pool_specs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.WorkerPoolSpecOrBuilder>
      getWorkerPoolSpecsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The spec of the worker pools including machine type and Docker image.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.WorkerPoolSpec worker_pool_specs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.WorkerPoolSpecOrBuilder getWorkerPoolSpecsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Scheduling options for a CustomJob.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Scheduling scheduling = 3;</code>
   *
   * @return Whether the scheduling field is set.
   */
  boolean hasScheduling();
  /**
   *
   *
   * <pre>
   * Scheduling options for a CustomJob.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Scheduling scheduling = 3;</code>
   *
   * @return The scheduling.
   */
  com.google.cloud.aiplatform.v1beta1.Scheduling getScheduling();
  /**
   *
   *
   * <pre>
   * Scheduling options for a CustomJob.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Scheduling scheduling = 3;</code>
   */
  com.google.cloud.aiplatform.v1beta1.SchedulingOrBuilder getSchedulingOrBuilder();

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to store the output of this CustomJob or
   * HyperparameterTuningJob. For HyperparameterTuningJob,
   * [base_output_directory][CustomJob.job_spec.base_output_directory] of
   * each child CustomJob backing a Trial is set to a subdirectory of name
   * [id][google.cloud.aiplatform.v1beta1.Trial.id] under parent HyperparameterTuningJob's
   * [base_output_directory][HyperparameterTuningJob.trial_job_spec.base_output_directory].
   * Following AI Platform environment variables will be passed to containers or
   * python modules when this field is set:
   *   For CustomJob:
   *   * AIP_MODEL_DIR = `&lt;base_output_directory&gt;/model/`
   *   * AIP_CHECKPOINT_DIR = `&lt;base_output_directory&gt;/checkpoints/`
   *   * AIP_TENSORBOARD_LOG_DIR = `&lt;base_output_directory&gt;/logs/`
   *   For CustomJob backing a Trial of HyperparameterTuningJob:
   *   * AIP_MODEL_DIR = `&lt;base_output_directory&gt;/&lt;trial_id&gt;/model/`
   *   * AIP_CHECKPOINT_DIR = `&lt;base_output_directory&gt;/&lt;trial_id&gt;/checkpoints/`
   *   * AIP_TENSORBOARD_LOG_DIR = `&lt;base_output_directory&gt;/&lt;trial_id&gt;/logs/`
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GcsDestination base_output_directory = 6;</code>
   *
   * @return Whether the baseOutputDirectory field is set.
   */
  boolean hasBaseOutputDirectory();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to store the output of this CustomJob or
   * HyperparameterTuningJob. For HyperparameterTuningJob,
   * [base_output_directory][CustomJob.job_spec.base_output_directory] of
   * each child CustomJob backing a Trial is set to a subdirectory of name
   * [id][google.cloud.aiplatform.v1beta1.Trial.id] under parent HyperparameterTuningJob's
   * [base_output_directory][HyperparameterTuningJob.trial_job_spec.base_output_directory].
   * Following AI Platform environment variables will be passed to containers or
   * python modules when this field is set:
   *   For CustomJob:
   *   * AIP_MODEL_DIR = `&lt;base_output_directory&gt;/model/`
   *   * AIP_CHECKPOINT_DIR = `&lt;base_output_directory&gt;/checkpoints/`
   *   * AIP_TENSORBOARD_LOG_DIR = `&lt;base_output_directory&gt;/logs/`
   *   For CustomJob backing a Trial of HyperparameterTuningJob:
   *   * AIP_MODEL_DIR = `&lt;base_output_directory&gt;/&lt;trial_id&gt;/model/`
   *   * AIP_CHECKPOINT_DIR = `&lt;base_output_directory&gt;/&lt;trial_id&gt;/checkpoints/`
   *   * AIP_TENSORBOARD_LOG_DIR = `&lt;base_output_directory&gt;/&lt;trial_id&gt;/logs/`
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GcsDestination base_output_directory = 6;</code>
   *
   * @return The baseOutputDirectory.
   */
  com.google.cloud.aiplatform.v1beta1.GcsDestination getBaseOutputDirectory();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location to store the output of this CustomJob or
   * HyperparameterTuningJob. For HyperparameterTuningJob,
   * [base_output_directory][CustomJob.job_spec.base_output_directory] of
   * each child CustomJob backing a Trial is set to a subdirectory of name
   * [id][google.cloud.aiplatform.v1beta1.Trial.id] under parent HyperparameterTuningJob's
   * [base_output_directory][HyperparameterTuningJob.trial_job_spec.base_output_directory].
   * Following AI Platform environment variables will be passed to containers or
   * python modules when this field is set:
   *   For CustomJob:
   *   * AIP_MODEL_DIR = `&lt;base_output_directory&gt;/model/`
   *   * AIP_CHECKPOINT_DIR = `&lt;base_output_directory&gt;/checkpoints/`
   *   * AIP_TENSORBOARD_LOG_DIR = `&lt;base_output_directory&gt;/logs/`
   *   For CustomJob backing a Trial of HyperparameterTuningJob:
   *   * AIP_MODEL_DIR = `&lt;base_output_directory&gt;/&lt;trial_id&gt;/model/`
   *   * AIP_CHECKPOINT_DIR = `&lt;base_output_directory&gt;/&lt;trial_id&gt;/checkpoints/`
   *   * AIP_TENSORBOARD_LOG_DIR = `&lt;base_output_directory&gt;/&lt;trial_id&gt;/logs/`
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.GcsDestination base_output_directory = 6;</code>
   */
  com.google.cloud.aiplatform.v1beta1.GcsDestinationOrBuilder getBaseOutputDirectoryOrBuilder();
}
