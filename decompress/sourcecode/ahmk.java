import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmk extends agzi implements ahax
{
    public static final ahmk a;
    public static final agzg b;
    private static volatile ahbe f;
    public int c;
    public String d;
    public String e;
    
    static {
        final ahmk a2 = new ahmk();
        agzi.registerDefaultInstance((Class)ahmk.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (agzn)null, 370527389, ahcm.k, (Class)ahmk.class);
    }
    
    private ahmk() {
        this.d = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ahmk.f) == null) {
                    synchronized (ahmk.class) {
                        if (ahmk.f == null) {
                            ahmk.f = (ahbe)new agzb((agzi)ahmk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahmk.a;
            }
            case 4: {
                return new agza((agzi)ahmk.a);
            }
            case 3: {
                return new ahmk();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahmk.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "c", "d", "e" });
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
