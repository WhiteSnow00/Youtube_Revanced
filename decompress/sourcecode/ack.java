// 
// Decompiled by Procyon v0.6.0
// 

final class ack
{
    acm a;
    final /* synthetic */ acl b;
    
    public ack(final acl b) {
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final acm a = this.a;
        String s;
        String string = s = "[ ";
        if (a != null) {
            int n = 0;
            while (true) {
                s = string;
                if (n >= 9) {
                    break;
                }
                final float n2 = this.a.i[n];
                final StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(n2);
                sb.append(" ");
                string = sb.toString();
                ++n;
            }
        }
        final String value = String.valueOf(this.a);
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(s);
        sb2.append("] ");
        sb2.append(value);
        return sb2.toString();
    }
}
