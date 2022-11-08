import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajpk extends agzi implements ahax
{
    public static final ajpk a;
    private static volatile ahbe h;
    public int b;
    public aiuh c;
    public aixw d;
    public aith e;
    public aiso f;
    public aitp g;
    private aitw i;
    private apmc j;
    private amiv k;
    private aihj l;
    private anhf m;
    private aoeq n;
    private akdz o;
    private byte p;
    
    static {
        agzi.registerDefaultInstance((Class)ajpk.class, (agzi)(a = new ajpk()));
    }
    
    private ajpk() {
        this.p = 2;
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
                final ahbe h;
                if ((h = ajpk.h) == null) {
                    synchronized (ajpk.class) {
                        if (ajpk.h == null) {
                            ajpk.h = (ahbe)new agzb((agzi)ajpk.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajpk.a;
            }
            case 4: {
                return new agza((agzi)ajpk.a);
            }
            case 3: {
                return new ajpk();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajpk.a, "\u0001\f\u0000\u0001\ue1d6\u181e\ufd9c\u3306\f\u0000\u0000\f\ue1d6\u181e\u1409\u0006\uf243\u181f\u1409\b\uf143\u1824\u1409\u0000\ufcf4\u1830\u1409\t\ue567\u1832\u1409\u0004\uef41\u1838\u1409\u0003\ue9c4\u1be3\u1409\u0007\uea1c\u1be3\u1409\u0002\uec81\u27d5\u1409\u000b\uf5b1\u2f1e\u1409\u0001\uf76d\u32f4\u1409\u0005\ufd9c\u3306\u1409\n", new Object[] { "b", "j", "l", "c", "m", "g", "f", "k", "e", "o", "d", "i", "n" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.p = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
