import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahrf extends agzi implements ahax
{
    public static final ahrf a;
    private static volatile ahbe i;
    public int b;
    public int c;
    public ahrc d;
    public boolean e;
    public agzy f;
    public ahqz g;
    public ahre h;
    
    static {
        agzi.registerDefaultInstance(ahrf.class, a = new ahrf());
    }
    
    private ahrf() {
        this.f = agzi.emptyProtobufList();
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
                if ((i = ahrf.i) == null) {
                    synchronized (ahrf.class) {
                        if (ahrf.i == null) {
                            ahrf.i = (ahbe)new agzb((agzi)ahrf.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ahrf.a;
            }
            case 4: {
                return new agza((int[][])null, (boolean[][])null);
            }
            case 3: {
                return new ahrf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahrf.a, "\u0001\u0006\u0000\u0001\u0001\uf743\u3938\u0006\u0000\u0001\u0000\u0001\u100c\u0000\u0006\u1007\u0005\t\u001a\u000b\u1009\b\uf38c\u35de\u1009\u0002\uf743\u3938\u1009\u0007", new Object[] { "b", "c", ahng.q, "e", "f", "h", "d", "g" });
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
