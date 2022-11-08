import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajwm extends agzi implements ahax
{
    private static final ajwm a;
    private static volatile ahbe b;
    private int c;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ajwm.class, a = new ajwm());
    }
    
    private ajwm() {
    }
    
    public static ajwl a() {
        return (ajwl)ajwm.a.createBuilder();
    }
    
    private void d(final ajwk ajwk) {
        this.d = ajwk.f;
        this.c |= 0x1;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ajwm.b) == null) {
                    synchronized (ajwm.class) {
                        if (ajwm.b == null) {
                            ajwm.b = (ahbe)new agzb((agzi)ajwm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajwm.a;
            }
            case 4: {
                return new ajwl();
            }
            case 3: {
                return new ajwm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajwm.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "c", "d", ajwk.a() });
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
