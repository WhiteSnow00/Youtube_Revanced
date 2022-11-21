import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public interface atrs extends atrr
{
    Object call(final Object... p0);
    
    Object callBy(final Map p0);
    
    List getParameters();
    
    atrx getReturnType();
    
    List getTypeParameters();
    
    atry getVisibility();
    
    boolean isAbstract();
    
    boolean isFinal();
    
    boolean isOpen();
    
    boolean isSuspend();
}
