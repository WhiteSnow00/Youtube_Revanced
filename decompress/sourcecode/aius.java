import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aius extends agzi implements ahax
{
    public static final aius a;
    public static final agzg b;
    private static volatile ahbe h;
    public int c;
    public String d;
    public String e;
    public int f;
    public boolean g;
    
    static {
        final aius a2 = new aius();
        agzi.registerDefaultInstance(aius.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 279698363, ahcm.k, aius.class);
    }
    
    private aius() {
        this.d = "";
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = aius.h) == null) {
                    synchronized (aius.class) {
                        if (aius.h == null) {
                            aius.h = (ahbe)new agzb((agzi)aius.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aius.a;
            }
            case 4: {
                return new agza((agzi)aius.a);
            }
            case 3: {
                return new aius();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aius.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u1007\u0003", new Object[] { "c", "d", "e", "f", "g" });
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
