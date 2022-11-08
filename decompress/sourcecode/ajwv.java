import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwv extends agzi implements ahax
{
    public static final ajwv a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public Object d;
    public String e;
    
    static {
        agzi.registerDefaultInstance(ajwv.class, a = new ajwv());
    }
    
    private ajwv() {
        this.c = 0;
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
                final ahbe f;
                if ((f = ajwv.f) == null) {
                    synchronized (ajwv.class) {
                        if (ajwv.f == null) {
                            ajwv.f = (ahbe)new agzb((agzi)ajwv.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajwv.a;
            }
            case 4: {
                return new agza((agzi)ajwv.a);
            }
            case 3: {
                return new ajwv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajwv.a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1037\u0000\u0003\u1034\u0000\u0004\u103a\u0000\u0005\u103b\u0000\u0006\u103d\u0000", new Object[] { "d", "c", "b", "e" });
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
