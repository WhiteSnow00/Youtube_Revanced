import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqwp extends agzi implements ahax
{
    public static final aqwp a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public Object d;
    public int e;
    public agzy f;
    
    static {
        agzi.registerDefaultInstance(aqwp.class, a = new aqwp());
    }
    
    private aqwp() {
        this.c = 0;
        this.f = agzi.emptyProtobufList();
    }
    
    public final void a() {
        final agzy f = this.f;
        if (!f.c()) {
            this.f = agzi.mutableCopy(f);
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
                final ahbe g;
                if ((g = aqwp.g) == null) {
                    synchronized (aqwp.class) {
                        if (aqwp.g == null) {
                            aqwp.g = (ahbe)new agzb((agzi)aqwp.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqwp.a;
            }
            case 4: {
                return new agza((byte[][][])null, (float[])null);
            }
            case 3: {
                return new aqwp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqwp.a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u103c\u0000\u0003\u001b\u0004\u103c\u0000", new Object[] { "d", "c", "b", "e", aqtg.m, aqwm.class, "f", aqwn.class, aqwo.class });
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
