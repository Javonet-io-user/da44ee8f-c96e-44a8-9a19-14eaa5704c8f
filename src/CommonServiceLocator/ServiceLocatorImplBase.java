package CommonServiceLocator;

import Common.Activation;
import static Common.Helper.Convert;
import static Common.Helper.getGetObjectName;
import static Common.Helper.getReturnObjectName;
import static Common.Helper.ConvertToConcreteInterfaceImplementation;
import Common.Helper;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import CommonServiceLocator.*;
import jio.System.*;
import jio.System.Collections.Generic.*;

public abstract class ServiceLocatorImplBase implements IServiceLocator, IServiceProvider {
  protected NObject javonetHandle;

  public ServiceLocatorImplBase(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public Object GetInstance(jio.System.Type serviceType) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("CommonServiceLocator.IServiceLocator")
              .invoke("GetInstance", serviceType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object GetInstance(jio.System.Type serviceType, java.lang.String key) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("CommonServiceLocator.IServiceLocator")
              .invoke("GetInstance", serviceType, key);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public IEnumerable<Object> GetAllInstances(jio.System.Type serviceType) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("CommonServiceLocator.IServiceLocator")
              .invoke("GetAllInstances", serviceType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <TService> TService GetInstance(Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getReturnObjectName(returnType))
              .explicitInterface("CommonServiceLocator.IServiceLocator")
              .invoke("GetInstance");
      if (res == null) return null;
      return (TService) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <TService> TService GetInstance(java.lang.String key, Class<?> returnType) {
    try {
      Object res =
          javonetHandle
              .generic(getReturnObjectName(returnType))
              .explicitInterface("CommonServiceLocator.IServiceLocator")
              .invoke("GetInstance", key);
      if (res == null) return null;
      return (TService) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public <TService> IEnumerable<TService> GetAllInstances() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("CommonServiceLocator.IServiceLocator")
              .invoke("GetAllInstances");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object GetService(jio.System.Type serviceType) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.IServiceProvider")
              .invoke("GetService", serviceType);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
