// This is a generated file. Not intended for manual editing.
package com.boolerules.prl.plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.boolerules.prl.plugin.psi.PrlTypes.*;
import com.boolerules.prl.plugin.psi.PrlASTWrapperPsiElement;
import com.boolerules.prl.plugin.psi.*;

public class MandatoryFeatureRuleImpl extends PrlASTWrapperPsiElement implements MandatoryFeatureRule {

  public MandatoryFeatureRuleImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull Visitor visitor) {
    visitor.visitMandatoryFeatureRule(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FeatureRef getFeatureRef() {
    return findChildByClass(FeatureRef.class);
  }

  @Override
  @Nullable
  public FeatureRestriction getFeatureRestriction() {
    return findChildByClass(FeatureRestriction.class);
  }

  @Override
  @Nullable
  public FeatureVersionRestriction getFeatureVersionRestriction() {
    return findChildByClass(FeatureVersionRestriction.class);
  }

}
