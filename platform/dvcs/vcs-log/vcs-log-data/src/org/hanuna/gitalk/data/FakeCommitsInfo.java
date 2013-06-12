package org.hanuna.gitalk.data;

import org.hanuna.gitalk.graph.elements.Node;
import org.hanuna.gitalk.data.rebase.FakeCommitParents;
import com.intellij.vcs.log.Ref;

import java.util.List;

public class FakeCommitsInfo {

  public final List<FakeCommitParents> commits;
  public final Node base;
  public final int insertAbove;
  public final Ref resultRef;
  public final Ref subjectRef;

  public FakeCommitsInfo(List<FakeCommitParents> commits, Node base, int insertAbove, Ref resultRef, Ref subjectRef) {
    this.commits = commits;
    this.base = base;
    this.insertAbove = insertAbove;
    this.resultRef = resultRef;
    this.subjectRef = subjectRef;
  }
}
