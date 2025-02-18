# git and github day 6

when multiple developers in the same code , then we need to know the differences

1. git diff - (compares working directory to commit directory)(changes done in file after commit)

2. git diff --staged ( to see the differnece between staging to commit area)

3. git diff a81063e(commit id) HEAD

4. git diff index.html(file name)-(to see changes in particular file)

## if we want to restore the file after deleting
git restore file.txt(file name) 

## to rename a file
git mv (old file name) (new file name)

## taking the data of previous file to new file
git restore --staged (old file name) (new file name)

## showing renamed files
git diff --find-renames

## if we want to go back to any commit
git reset (commit id) - The git reset <commit id> command is used to move the current branch to a specific commit, altering the commit history


5. git reset (commit id) --hard :- This command is a powerful tool in Git that resets your current branch to a specific commit, discarding all changes in your working directory and staging area. 

## for getting limited no of commits
 git log -n 5 (for getting top 5 commits)

## search within git log
 git log --grep="done"

 to find any commit with done msg. example-"rename done" will show on executing this command

## to see changes in any particular commit
git show ff6e0a8(commit id)

