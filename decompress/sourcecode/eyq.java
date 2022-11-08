// 
// Decompiled by Procyon v0.6.0
// 

public final class eyq extends aclr
{
    private final acjb a;
    
    public eyq(final acno acno, final aihu aihu) {
        final acjb a = new acjb();
        this.a = a;
        if (d(aihu) != null) {
            acno.b((Class)aihw.class);
            a.add((Object)d(aihu));
            return;
        }
        acno.b((Class)aihu.class);
        a.add((Object)aihu);
    }
    
    private static aihw d(final aihu aihu) {
        aihy aihy;
        if ((aihy = aihu.c) == null) {
            aihy = aihy.a;
        }
        if ((aihy.b & 0x4) != 0x0) {
            aihy aihy2;
            if ((aihy2 = aihu.c) == null) {
                aihy2 = aihy.a;
            }
            aihw aihw;
            if ((aihw = aihy2.c) == null) {
                aihw = aihw.a;
            }
            return aihw;
        }
        return null;
    }
    
    public final achk a() {
        return (achk)this.a;
    }
}
