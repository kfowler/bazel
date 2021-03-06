// Copyright 2014 Google Inc. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.google.devtools.build.lib.analysis.actions;

import com.google.devtools.build.lib.actions.ActionOwner;
import com.google.devtools.build.lib.analysis.AnalysisEnvironment;
import com.google.devtools.build.lib.analysis.config.BuildConfiguration;
import com.google.devtools.build.lib.packages.Rule;

/**
 * A temporary interface to allow migration from RuleConfiguredTarget to RuleContext. It bundles
 * the items commonly needed to construct action instances.
 */
public interface ActionConstructionContext {
  /** The rule for which the actions are constructed. */
  Rule getRule();

  /** Returns the action owner that should be used for actions. */
  ActionOwner getActionOwner();

  /** Returns the {@link BuildConfiguration} for which the given rule is analyzed. */
  BuildConfiguration getConfiguration();

  /** The current analysis environment. */
  AnalysisEnvironment getAnalysisEnvironment();
}
