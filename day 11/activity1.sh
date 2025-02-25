SCRIPT_DIR=$(dirname "$0")
SOURCE_DIR="$SCRIPT_DIR/Scripting.md"
BACKUP_DIR="$SCRIPT_DIR/backup"
TIMESTAMP=$(date +%Y%m%d%H%M%S)

BACKUP_FILE="backup-$TIMESTAMP.tar.gz"

mkdir -p $BACKUP_DIR

tar -czf "$BACKUP_DIR/$BACKUP_FILE" "$SOURCE_DIR"