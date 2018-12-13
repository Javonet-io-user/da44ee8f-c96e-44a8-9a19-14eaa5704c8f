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

public interface IServiceLocator extends IServiceProvider {
  public Object GetInstance(jio.System.Type serviceType);

  public Object GetInstance(jio.System.Type serviceType, java.lang.String key);

  public IEnumerable<Object> GetAllInstances(jio.System.Type serviceType);

  public <TService> TService GetInstance(Class<?> returnType);

  public <TService> TService GetInstance(java.lang.String key, Class<?> returnType);

  public <TService> IEnumerable<TService> GetAllInstances();
}
