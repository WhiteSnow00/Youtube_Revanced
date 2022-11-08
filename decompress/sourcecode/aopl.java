import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopl extends agzi implements ahax
{
    public static final aopl a;
    public static final agzg b;
    private static volatile ahbe g;
    public int c;
    public String d;
    public String e;
    public aopm f;
    private int h;
    
    static {
        final aopl a2 = new aopl();
        agzi.registerDefaultInstance((Class)aopl.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (agzn)null, 228301911, ahcm.k, (Class)aopl.class);
    }
    
    private aopl() {
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
                final ahbe g;
                if ((g = aopl.g) == null) {
                    synchronized (aopl.class) {
                        if (aopl.g == null) {
                            aopl.g = (ahbe)new agzb((agzi)aopl.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aopl.a;
            }
            case 4: {
                return new agza((agzi)aopl.a);
            }
            case 3: {
                return new aopl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aopl.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1009\u0003", new Object[] { "h", "c", "d", "e", "f" });
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
