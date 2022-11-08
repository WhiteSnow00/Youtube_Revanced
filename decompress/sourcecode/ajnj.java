import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajnj extends agzi implements ahax
{
    public static final ajnj a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)ajnj.class, (agzi)(a = new ajnj()));
    }
    
    private ajnj() {
        this.b = 0;
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ajnj.d) == null) {
                    synchronized (ajnj.class) {
                        if (ajnj.d == null) {
                            ajnj.d = (ahbe)new agzb((agzi)ajnj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajnj.a;
            }
            case 4: {
                return new agza((agzi)ajnj.a);
            }
            case 3: {
                return new ajnj();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajnj.a, "\u0001\u0014\u0001\u0000\ue7f5\u178e\ufd01\ud641\u0014\u0000\u0000\u0012\ue7f5\u178e\u143c\u0000\uf74f\u2a6b\u143c\u0000\ufbe1\u497c\u143c\u0000\uf72c\u4c0d\u143c\u0000\uf9b6\u731e\u143c\u0000\ufcb5\u7336\u143c\u0000\uf99a\u7806\u143c\u0000\ued5f\u7aca\u143c\u0000\ue48e\u7e53\u143c\u0000\ue0aa\u8a59\u143c\u0000\uf599\u9392\u143c\u0000\uf7f8\u9827\u143c\u0000\uec75\u9b33\u143c\u0000\ufeaa\u9d21\u143c\u0000\ue2cd\ua7ca\u143c\u0000\ufe79\ub146\u143c\u0000\ue94e\ub51b\u143c\u0000\ue41f\uc50a\u103c\u0000\ue0f7\ud1e5\u103c\u0000\ufd01\ud641\u143c\u0000", new Object[] { "c", "b", anws.class, akac.class, aotz.class, aiwc.class, aina.class, ainc.class, ainf.class, ahif.class, ahot.class, ajnm.class, alvh.class, anvl.class, amdx.class, anlq.class, aojv.class, ajrk.class, airg.class, aivv.class, aoct.class, apse.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
