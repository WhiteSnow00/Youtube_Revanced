import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmg extends agzi implements ahax
{
    public static final ajmg a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)ajmg.class, (agzi)(a = new ajmg()));
    }
    
    private ajmg() {
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
                if ((d = ajmg.d) == null) {
                    synchronized (ajmg.class) {
                        if (ajmg.d == null) {
                            ajmg.d = (ahbe)new agzb((agzi)ajmg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajmg.a;
            }
            case 4: {
                return new agza((agzi)ajmg.a);
            }
            case 3: {
                return new ajmg();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajmg.a, "\u0001\u0003\u0001\u0000\uf739\u3c3c\uff72\ue641\u0007\u0003\u0000\u0000\u0003\uf739\u3c3c\u143c\u0000\ue15a\u51cd\u143c\u0000\uff72\ue641\u0007\u143c\u0000", new Object[] { "c", "b", ajmf.class, ajmj.class, ajmi.class });
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
