// This is a generated file. Not intended for manual editing.
package com.boolerules.prl.plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ForbiddenFeatureRule extends PsiElement {

  @Nullable
  FeatureRef getFeatureRef();

  @Nullable
  FeatureRestriction getFeatureRestriction();

  @Nullable
  FeatureVersionRestriction getFeatureVersionRestriction();

}
