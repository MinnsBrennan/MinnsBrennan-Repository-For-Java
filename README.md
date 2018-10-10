BIG CHANGES

# Exercise: Getting used to git

This repository contains an example Java project. Your task is to use git tools to get your own copy on your development machine, make a change and then use git tools to update the version stored on the GitHUb server.

## Part 1: Set up this computer to use git and GitHub.

You will need to do this for every computer you wish to use on this module

1. Make sure that the **git** command and its friends are in your command path. The easiest way to do this is to use **Git Bash**: select your Eclipse workspace in the file browser, then right click and select "Git Bash Here". When the Git Bash command window appears, type ``git --help`` and you should see a page or two of "help".
2. Tell git who you are:
```
	git config --global user.name "Your Name"
	git config --global user.email "yourid@uos.ac.uk"
```
3. Create an ssh key pair and share the public key with GitHub. In the Git Bash window, type ``ssh-keygen`` and follow the instructions. If you wish to be extra secure you can enter a passphrase when prompted, but bear in mind that you will need to enter this every time you transfer anything to or from GitHub. I usually leave this empty.
4. Display your public key using ``cat ~/.ssh/id_rsa.pub`` and copy the text to your clipboard
5. Click on your profile icon on the top-right of this GitHub page to show a drop-down list. right-click on **Settings** and open in a new browser tab so you can still read these instructions.
6. Go to the new tab and click **SSH and GPG keys** from the list on the left, then click the green button labelled **New SSH Key**.
7. Type a name for this computer into the Title box, paste your copied SSH key into the Key box, then click the green **Add SSH key** button.

If you did all that correctly, you have now set up this computer to use git, and authorised it to access your GitHub account

## Part 2: Get a copy of this "repository" so you can make changes

1. Near the top of the page you are reading is a green **Clone or download** button. Click it and copy the ssh URL (begins *git@github.com:*...)
2. In your Git Bash window, type ``git clone `` and paste in the copied URL, all on one line, then press enter. This will get a duplicate (clone) of the remote repository on your development machine.
3. Type ``ls`` to see the new folder

## Part 3: Open the repository in Eclipse

The repository contains the Eclipse metadata, so all you need to do is open it in Eclipse.

1. Click File:Import to show the import dialog.
2. Unfold the "General" section and double-click "Existing projects into workspace".
3. Click the "Browse" button at the top right, navigate to the repository folder you have just created and select it.
4. Click "OK" and the new repository folder will appear in the centre of the "Import" dialog.
5. Click "Finish" and the the new project should appear in the Package Explorer.

## Part 4: Working with this project 

This repository has been set up with the correct folder structure for a Java project, and can be used as a starting point for classroom exercises, homework, assignments and even your own Java projects. To start a new project based on this template, go to your GitHub account and "Fork" the repository to a new name, the continue from step 2 above with the new repository. Replace this README with your own documentation.

Have Fun!