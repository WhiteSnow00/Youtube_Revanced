import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoeb extends agzi implements ahax
{
    public static final aoeb a;
    public static final agzg b;
    private static volatile ahbe i;
    public int c;
    public String d;
    public String e;
    public boolean f;
    public String g;
    public long h;
    
    static {
        final aoeb a2 = new aoeb();
        agzi.registerDefaultInstance(aoeb.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 262904603, ahcm.k, aoeb.class);
    }
    
    private aoeb() {
        this.d = "";
        this.e = "";
        this.g = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe i;
                if ((i = aoeb.i) == null) {
                    synchronized (aoeb.class) {
                        if (aoeb.i == null) {
                            aoeb.i = (ahbe)new agzb((agzi)aoeb.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aoeb.a;
            }
            case 4: {
                return new agza((agzi)aoeb.a);
            }
            case 3: {
                return new aoeb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoeb.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0004\u1007\u0003\u0005\u1008\u0004\u0006\u1003\u0005", new Object[] { "c", "d", "e", "f", "g", "h" });
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
