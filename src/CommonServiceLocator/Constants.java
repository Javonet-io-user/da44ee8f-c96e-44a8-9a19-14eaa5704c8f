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

public class Constants {
  protected NObject javonetHandle;
  /** GetFiled */
  public static java.lang.String getActivateAllExceptionMessage() {
    try {
      java.lang.String res = Javonet.getType("Constants").get("ActivateAllExceptionMessage");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setActivateAllExceptionMessage(java.lang.String param) {
    try {
      Javonet.getType("Constants").set("ActivateAllExceptionMessage", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getActivationExceptionMessage() {
    try {
      java.lang.String res = Javonet.getType("Constants").get("ActivationExceptionMessage");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setActivationExceptionMessage(java.lang.String param) {
    try {
      Javonet.getType("Constants").set("ActivationExceptionMessage", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getServiceLocationProviderNotSetMessage() {
    try {
      java.lang.String res =
          Javonet.getType("Constants").get("ServiceLocationProviderNotSetMessage");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setServiceLocationProviderNotSetMessage(java.lang.String param) {
    try {
      Javonet.getType("Constants").set("ServiceLocationProviderNotSetMessage", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
