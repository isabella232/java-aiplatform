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
// source: google/cloud/aiplatform/v1beta1/data_labeling_job.proto

package com.google.cloud.aiplatform.v1beta1;

public final class DataLabelingJobProto {
  private DataLabelingJobProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_AnnotationLabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_AnnotationLabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ActiveLearningConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ActiveLearningConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SampleConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SampleConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_TrainingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_TrainingConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/aiplatform/v1beta1/data_l"
          + "abeling_job.proto\022\037google.cloud.aiplatfo"
          + "rm.v1beta1\032\037google/api/field_behavior.pr"
          + "oto\032\031google/api/resource.proto\0326google/c"
          + "loud/aiplatform/v1beta1/accelerator_type"
          + ".proto\032/google/cloud/aiplatform/v1beta1/"
          + "job_state.proto\0325google/cloud/aiplatform"
          + "/v1beta1/specialist_pool.proto\032\034google/p"
          + "rotobuf/struct.proto\032\037google/protobuf/ti"
          + "mestamp.proto\032\027google/type/money.proto\032\034"
          + "google/api/annotations.proto\"\206\010\n\017DataLab"
          + "elingJob\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n\014display_n"
          + "ame\030\002 \001(\tB\003\340A\002\022;\n\010datasets\030\003 \003(\tB)\340A\002\372A#"
          + "\n!aiplatform.googleapis.com/Dataset\022a\n\021a"
          + "nnotation_labels\030\014 \003(\0132F.google.cloud.ai"
          + "platform.v1beta1.DataLabelingJob.Annotat"
          + "ionLabelsEntry\022\032\n\rlabeler_count\030\004 \001(\005B\003\340"
          + "A\002\022\034\n\017instruction_uri\030\005 \001(\tB\003\340A\002\022\036\n\021inpu"
          + "ts_schema_uri\030\006 \001(\tB\003\340A\002\022+\n\006inputs\030\007 \001(\013"
          + "2\026.google.protobuf.ValueB\003\340A\002\022=\n\005state\030\010"
          + " \001(\0162).google.cloud.aiplatform.v1beta1.J"
          + "obStateB\003\340A\003\022\036\n\021labeling_progress\030\r \001(\005B"
          + "\003\340A\003\022.\n\rcurrent_spend\030\016 \001(\0132\022.google.typ"
          + "e.MoneyB\003\340A\003\0224\n\013create_time\030\t \001(\0132\032.goog"
          + "le.protobuf.TimestampB\003\340A\003\0224\n\013update_tim"
          + "e\030\n \001(\0132\032.google.protobuf.TimestampB\003\340A\003"
          + "\022L\n\006labels\030\013 \003(\0132<.google.cloud.aiplatfo"
          + "rm.v1beta1.DataLabelingJob.LabelsEntry\022\030"
          + "\n\020specialist_pools\030\020 \003(\t\022U\n\026active_learn"
          + "ing_config\030\025 \001(\01325.google.cloud.aiplatfo"
          + "rm.v1beta1.ActiveLearningConfig\0327\n\025Annot"
          + "ationLabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002"
          + " \001(\t:\0028\001\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005"
          + "value\030\002 \001(\t:\0028\001:|\352Ay\n)aiplatform.googlea"
          + "pis.com/DataLabelingJob\022Lprojects/{proje"
          + "ct}/locations/{location}/dataLabelingJob"
          + "s/{data_labeling_job}\"\202\002\n\024ActiveLearning"
          + "Config\022\035\n\023max_data_item_count\030\001 \001(\003H\000\022\"\n"
          + "\030max_data_item_percentage\030\002 \001(\005H\000\022D\n\rsam"
          + "ple_config\030\003 \001(\0132-.google.cloud.aiplatfo"
          + "rm.v1beta1.SampleConfig\022H\n\017training_conf"
          + "ig\030\004 \001(\0132/.google.cloud.aiplatform.v1bet"
          + "a1.TrainingConfigB\027\n\025human_labeling_budg"
          + "et\"\275\002\n\014SampleConfig\022)\n\037initial_batch_sam"
          + "ple_percentage\030\001 \001(\005H\000\022+\n!following_batc"
          + "h_sample_percentage\030\003 \001(\005H\001\022U\n\017sample_st"
          + "rategy\030\005 \001(\0162<.google.cloud.aiplatform.v"
          + "1beta1.SampleConfig.SampleStrategy\"B\n\016Sa"
          + "mpleStrategy\022\037\n\033SAMPLE_STRATEGY_UNSPECIF"
          + "IED\020\000\022\017\n\013UNCERTAINTY\020\001B\033\n\031initial_batch_"
          + "sample_sizeB\035\n\033following_batch_sample_si"
          + "ze\"6\n\016TrainingConfig\022$\n\034timeout_training"
          + "_milli_hours\030\001 \001(\003B\210\001\n#com.google.cloud."
          + "aiplatform.v1beta1B\024DataLabelingJobProto"
          + "P\001ZIgoogle.golang.org/genproto/googleapi"
          + "s/cloud/aiplatform/v1beta1;aiplatformb\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.AcceleratorTypeProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.JobStateProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.SpecialistPoolProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.type.MoneyProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Datasets",
              "AnnotationLabels",
              "LabelerCount",
              "InstructionUri",
              "InputsSchemaUri",
              "Inputs",
              "State",
              "LabelingProgress",
              "CurrentSpend",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "SpecialistPools",
              "ActiveLearningConfig",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_AnnotationLabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_AnnotationLabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_AnnotationLabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DataLabelingJob_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ActiveLearningConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ActiveLearningConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ActiveLearningConfig_descriptor,
            new java.lang.String[] {
              "MaxDataItemCount",
              "MaxDataItemPercentage",
              "SampleConfig",
              "TrainingConfig",
              "HumanLabelingBudget",
            });
    internal_static_google_cloud_aiplatform_v1beta1_SampleConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_SampleConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SampleConfig_descriptor,
            new java.lang.String[] {
              "InitialBatchSamplePercentage",
              "FollowingBatchSamplePercentage",
              "SampleStrategy",
              "InitialBatchSampleSize",
              "FollowingBatchSampleSize",
            });
    internal_static_google_cloud_aiplatform_v1beta1_TrainingConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_TrainingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_TrainingConfig_descriptor,
            new java.lang.String[] {
              "TimeoutTrainingMilliHours",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.AcceleratorTypeProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.JobStateProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.SpecialistPoolProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.type.MoneyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
