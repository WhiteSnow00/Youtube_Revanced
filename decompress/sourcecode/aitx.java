import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitx extends agzi implements ahax
{
    public static final aitx a;
    private static volatile ahbe e;
    public int b;
    public agzy c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(aitx.class, a = new aitx());
    }
    
    private aitx() {
        this.c = agzi.emptyProtobufList();
        emptyProtobufList();
    }
    
    public final void a() {
        final agzy c = this.c;
        if (!c.c()) {
            this.c = agzi.mutableCopy(c);
        }
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aitx.e) == null) {
                    synchronized (aitx.class) {
                        if (aitx.e == null) {
                            aitx.e = (ahbe)new agzb((agzi)aitx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aitx.a;
            }
            case 4: {
                return new agza((float[][][])null, (float[])null);
            }
            case 3: {
                return new aitx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aitx.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003\u1004\u0000", new Object[] { "b", "c", aitz.class, "d" });
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
