/*
 * Copyright (c) 2005 Your Corporation. All Rights Reserved.
 */
package com.intellij.util.xml;

import com.intellij.openapi.project.Project;
import com.intellij.psi.xml.XmlFile;
import com.intellij.util.xml.impl.DomFileElementImpl;
import org.jetbrains.annotations.NotNull;

/**
 * @author peter
 */
public abstract class DomManager {

  public static DomManager getDomManager(Project project) {
    return project.getComponent(DomManager.class);
  }

  public abstract Project getProject();

  public abstract void setNameStrategy(final XmlFile file, final NameStrategy strategy);

  @NotNull
  public abstract NameStrategy getNameStrategy(final XmlFile file);

  @NotNull
  public abstract <T extends DomElement> DomFileElementImpl<T> getFileElement(XmlFile file, Class<T> aClass, String rootTagName);

  public abstract void addDomEventListener(DomEventListener listener);

  public abstract void removeDomEventListener(DomEventListener listener);

  public abstract <T extends DomElement> void registerClassChooser(Class<T> aClass, ClassChooser<T> classChooser);

  public abstract <T extends DomElement> void unregisterClassChooser(Class<T> aClass);

  public abstract ConverterManager getConverterManager();

}
