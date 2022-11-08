import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahel extends agzi implements ahax
{
    public static final ahel a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(ahel.class, a = new ahel());
    }
    
    private ahel() {
        this.b = agzi.emptyProtobufList();
    }
    
    public final void a() {
        final agzy b = this.b;
        if (!b.c()) {
            this.b = agzi.mutableCopy(b);
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
                final ahbe c;
                if ((c = ahel.c) == null) {
                    synchronized (ahel.class) {
                        if (ahel.c == null) {
                            ahel.c = (ahbe)new agzb((agzi)ahel.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahel.a;
            }
            case 4: {
                return new agza((int[][][])null);
            }
            case 3: {
                return new ahel();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahel.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", ahek.class });
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
