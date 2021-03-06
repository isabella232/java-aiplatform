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
// source: google/cloud/aiplatform/v1beta1/endpoint.proto

package com.google.cloud.aiplatform.v1beta1;

public final class EndpointProto {
  private EndpointProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Endpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Endpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Endpoint_TrafficSplitEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Endpoint_TrafficSplitEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Endpoint_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Endpoint_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/aiplatform/v1beta1/endpoi"
          + "nt.proto\022\037google.cloud.aiplatform.v1beta"
          + "1\032\037google/api/field_behavior.proto\032\031goog"
          + "le/api/resource.proto\0321google/cloud/aipl"
          + "atform/v1beta1/explanation.proto\0327google"
          + "/cloud/aiplatform/v1beta1/machine_resour"
          + "ces.proto\032\037google/protobuf/timestamp.pro"
          + "to\032\034google/api/annotations.proto\"\373\004\n\010End"
          + "point\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n\014display_name"
          + "\030\002 \001(\tB\003\340A\002\022\023\n\013description\030\003 \001(\t\022L\n\017depl"
          + "oyed_models\030\004 \003(\0132..google.cloud.aiplatf"
          + "orm.v1beta1.DeployedModelB\003\340A\003\022R\n\rtraffi"
          + "c_split\030\005 \003(\0132;.google.cloud.aiplatform."
          + "v1beta1.Endpoint.TrafficSplitEntry\022\014\n\004et"
          + "ag\030\006 \001(\t\022E\n\006labels\030\007 \003(\01325.google.cloud."
          + "aiplatform.v1beta1.Endpoint.LabelsEntry\022"
          + "4\n\013create_time\030\010 \001(\0132\032.google.protobuf.T"
          + "imestampB\003\340A\003\0224\n\013update_time\030\t \001(\0132\032.goo"
          + "gle.protobuf.TimestampB\003\340A\003\0323\n\021TrafficSp"
          + "litEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\005:\0028\001"
          + "\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 "
          + "\001(\t:\0028\001:e\352Ab\n\"aiplatform.googleapis.com/"
          + "Endpoint\022<projects/{project}/locations/{"
          + "location}/endpoints/{endpoint}\"\361\003\n\rDeplo"
          + "yedModel\022R\n\023dedicated_resources\030\007 \001(\01323."
          + "google.cloud.aiplatform.v1beta1.Dedicate"
          + "dResourcesH\000\022R\n\023automatic_resources\030\010 \001("
          + "\01323.google.cloud.aiplatform.v1beta1.Auto"
          + "maticResourcesH\000\022\017\n\002id\030\001 \001(\tB\003\340A\003\0226\n\005mod"
          + "el\030\002 \001(\tB\'\340A\002\372A!\n\037aiplatform.googleapis."
          + "com/Model\022\024\n\014display_name\030\003 \001(\t\0224\n\013creat"
          + "e_time\030\006 \001(\0132\032.google.protobuf.Timestamp"
          + "B\003\340A\003\022J\n\020explanation_spec\030\t \001(\01320.google"
          + ".cloud.aiplatform.v1beta1.ExplanationSpe"
          + "c\022 \n\030enable_container_logging\030\014 \001(\010\022\035\n\025e"
          + "nable_access_logging\030\r \001(\010B\026\n\024prediction"
          + "_resourcesB\201\001\n#com.google.cloud.aiplatfo"
          + "rm.v1beta1B\rEndpointProtoP\001ZIgoogle.gola"
          + "ng.org/genproto/googleapis/cloud/aiplatf"
          + "orm/v1beta1;aiplatformb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_Endpoint_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Endpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Endpoint_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "DeployedModels",
              "TrafficSplit",
              "Etag",
              "Labels",
              "CreateTime",
              "UpdateTime",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Endpoint_TrafficSplitEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Endpoint_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Endpoint_TrafficSplitEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Endpoint_TrafficSplitEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Endpoint_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Endpoint_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_Endpoint_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Endpoint_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_descriptor,
            new java.lang.String[] {
              "DedicatedResources",
              "AutomaticResources",
              "Id",
              "Model",
              "DisplayName",
              "CreateTime",
              "ExplanationSpec",
              "EnableContainerLogging",
              "EnableAccessLogging",
              "PredictionResources",
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
    com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
