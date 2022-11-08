import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amiw extends agzi implements ahax
{
    public static final amiw a;
    public static final agzg b;
    private static volatile ahbe d;
    public agzy c;
    
    static {
        final amiw a2 = new amiw();
        agzi.registerDefaultInstance((Class)amiw.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (agzn)null, 290993185, ahcm.k, (Class)amiw.class);
    }
    
    private amiw() {
        this.c = agzi.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = amiw.d) == null) {
                    synchronized (amiw.class) {
                        if (amiw.d == null) {
                            amiw.d = (ahbe)new agzb((agzi)amiw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amiw.a;
            }
            case 4: {
                return new agza((agzi)amiw.a);
            }
            case 3: {
                return new amiw();
            }
            case 2: {
                return newMessageInfo((MessageLite)amiw.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] { "c" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
