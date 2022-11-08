import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahtj extends agzi implements ahax
{
    public static final ahtj a;
    private static volatile ahbe h;
    public int b;
    public boolean c;
    public String d;
    public String e;
    public int f;
    public boolean g;
    
    static {
        agzi.registerDefaultInstance(ahtj.class, a = new ahtj());
    }
    
    private ahtj() {
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
                if ((h = ahtj.h) == null) {
                    synchronized (ahtj.class) {
                        if (ahtj.h == null) {
                            ahtj.h = (ahbe)new agzb((agzi)ahtj.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ahtj.a;
            }
            case 4: {
                return new agza((agzi)ahtj.a);
            }
            case 3: {
                return new ahtj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahtj.a, "\u0001\u0005\u0000\u0001\u0002\t\u0005\u0000\u0000\u0000\u0002\u1007\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0007\u100c\u0004\t\u1007\b", new Object[] { "b", "c", "d", "e", "f", anvq.k, "g" });
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
